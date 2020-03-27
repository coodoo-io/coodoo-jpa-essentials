# coodoo-jpa-essentials

> Essential JPA entities and functionality

## Table of Contents

- [Background](#background)
- [Install](#install)
- [Usage](#usage)
- [API](#api)
- [Changelog](#changelog)
- [Maintainers](#maintainers)
- [Contribute](#contribute)
- [License](#license)

## Background

Every JPA entity needs an identifier and most of the time it is an auto increment number. Also in many cases you want to have the basic revision information stored for every entry.
Instead of always writing the same stuff you could just take this fields and functionality from abstract super classes. Enough said.


## Install

Add the following dependency to your project ([published on Maven Central](http://search.maven.org/#artifactdetails%7Cio.coodoo%7Ccoodoo-jpa-essentials%7C1.2.0%7Cjar)):

```xml
<dependency>
    <groupId>io.coodoo</groupId>
    <artifactId>coodoo-jpa-essentials</artifactId>
    <version>1.2.0</version>
</dependency>
```

## Usage

Following example will not only provide you an `@Id` annotated field, but also the revision field that will store the timestamps of creations and updates:

```java
import io.coodoo.framework.jpa.boundary.entity.RevisionDatesEntity;

@Entity
public class SomeEntity extends RevisionDatesEntity {

    @Column
    private String something;

    @Column
    private int amount;

    // ...
}
```


## API

All entities are annotated by the `@MappedSuperclass`, so all you need is to extend your entity by one of them.

### Identification entity

Since it is the most used identifier the root identification entity `BaseEntity` comes with an auto incremental `Long` named `id`.

### Optimistic concurrency control 

Every entity is inherited by an OCC entity `*OccEntity` that comes with an `@Version` annotated `Integer` named `version` as optimistic concurrency control value.

### Revision entities

All revision entities are using the `RevisionDatesEntity` super class. So they all come at least with `id`, `createdAt` and `updatedAt` field and if they are named something like "Occ", also the `version` field.

You can basically distinguish the revision option in create/update timestamps, paired with the responsible user and "marked as deleted" flags.


To provide the user ID (currently only type `Long` by the same reasons like the identifier) you have to implement the interface `RevisionUser` where ever you get your current users ID from.

For example:

```java
import io.coodoo.framework.jpa.boundary.RevisionUser;

@Stateless
public class UserService implements RevisionUser {

    // ...

    @Override
    public Long getUserId() {
        return getCurrentUser().getId();
    }

    // ...
}
```

### Fields

| Field         | Name          | Type            | Column       | Description                                                 |
|---------------|---------------|-----------------|--------------|-------------------------------------------------------------|
| ID            | `id`          | `Long`          | `id`         | Auto incremental identifier                                 |
| Creation Date | `createdAt`   | `LocalDateTime` | `created_at` | Timestamp of creation                                       |
| Creation User | `createdBy`   | `Long`          | `created_by` | ID of user who triggered the creation                       |
| Update Date   | `updatedAt`   | `LocalDateTime` | `updated_at` | Timestamp of last update                                    |
| Update User   | `updatedBy`   | `Long`          | `updated_by` | ID of user who triggered the update                         |
| Deletion Date | `deletedAt`   | `LocalDateTime` | `deleted_at` | Timestamp of deletion (just marked)                         |
| Deletion User | `deletedBy`   | `Long`          | `deleted_by` | ID of user who triggered the deletion                       |
| OCC           | `version`     | `Integer`       | `version`    | Optimistic concurrency control value                        |

### Entities

| Entity                                        | ID       | OCC      | Creat. Date | Creat. User | Upd. Date | Upd. User | Del. Date | Del. User |
|-----------------------------------------------|:--------:|:--------:|:-----------:|:-----------:|:---------:|:---------:|:---------:|:---------:|
| `AbstractCreatedAtEntity`                     |          |          | &#10003;    |             |           |           |           |           |
| `AbstractCreatedAtByEntity`                   |          |          | &#10003;    | &#10003;    |           |           |           |           |
| `AbstractCreatedUpdatedAtEntity`              |          |          | &#10003;    |             | &#10003;  |           |           |           |
| `AbstractCreatedUpdatedAtByEntity`            |          |          | &#10003;    | &#10003;    | &#10003;  | &#10003;  |           |           |
| `AbstractCreatedUpdatedDeletedAtEntity`       |          |          | &#10003;    |             | &#10003;  |           | &#10003;  |           |
| `AbstractCreatedUpdatedDeletedAtByEntity`     |          |          | &#10003;    | &#10003;    | &#10003;  | &#10003;  | &#10003;  | &#10003;  |
| `AbstractIdCreatedAtEntity`                   | &#10003; |          | &#10003;    |             |           |           |           |           |
| `AbstractIdCreatedAtByEntity`                 | &#10003; |          | &#10003;    | &#10003;    |           |           |           |           |
| `AbstractIdCreatedUpdatedAtEntity`            | &#10003; |          | &#10003;    |             | &#10003;  |           |           |           |
| `AbstractIdCreatedUpdatedAtByEntity`          | &#10003; |          | &#10003;    | &#10003;    | &#10003;  | &#10003;  |           |           |
| `AbstractIdCreatedUpdatedDeletedAtEntity`     | &#10003; |          | &#10003;    |             | &#10003;  |           | &#10003;  |           |
| `AbstractIdCreatedUpdatedDeletedAtByEntity`   | &#10003; |          | &#10003;    | &#10003;    | &#10003;  | &#10003;  | &#10003;  | &#10003;  |
| `AbstractIdOccCreatedAtEntity`                | &#10003; | &#10003; | &#10003;    |             |           |           |           |           |
| `AbstractIdOccCreatedAtByEntity`              | &#10003; | &#10003; | &#10003;    | &#10003;    |           |           |           |           |
| `AbstractIdOccCreatedUpdatedAtEntity`         | &#10003; | &#10003; | &#10003;    |             | &#10003;  |           |           |           |
| `AbstractIdOccCreatedUpdatedAtByEntity`       | &#10003; | &#10003; | &#10003;    | &#10003;    | &#10003;  | &#10003;  |           |           |
| `AbstractIdOccCreatedUpdatedDeletedAtEntity`  | &#10003; | &#10003; | &#10003;    |             | &#10003;  |           | &#10003;  |           |
| `AbstractIdOccCreatedUpdatedDeletedAtByEntity`| &#10003; | &#10003; | &#10003;    | &#10003;    | &#10003;  | &#10003;  | &#10003;  | &#10003;  |
| `AbstractOccCreatedAtEntity`                  |          | &#10003; | &#10003;    |             |           |           |           |           |
| `AbstractOccCreatedAtByEntity`                |          | &#10003; | &#10003;    | &#10003;    |           |           |           |           |
| `AbstractOccCreatedUpdatedAtEntity`           |          | &#10003; | &#10003;    |             | &#10003;  |           |           |           |
| `AbstractOccCreatedUpdatedAtByEntity`         |          | &#10003; | &#10003;    | &#10003;    | &#10003;  | &#10003;  |           |           |
| `AbstractOccCreatedUpdatedDeletedAtEntity`    |          | &#10003; | &#10003;    |             | &#10003;  |           | &#10003;  |           |
| `AbstractOccCreatedUpdatedDeletedAtByEntity`  |          | &#10003; | &#10003;    | &#10003;    | &#10003;  | &#10003;  | &#10003;  | &#10003;  |
| `AbstractIdEntity`                            | &#10003; |          |             |             |           |           |           |           |
| `AbstractIdOccEntity`                         | &#10003; | &#10003; |             |             |           |           |           |           |
| `AbstractOccEntity`                           |          | &#10003; |             |             |           |           |           |           |
| ~~`BaseEntity`~~                              | &#10003; |          |             |             |           |           |           |           |
| ~~`RevisionDatesEntity`~~                     | &#10003; |          | &#10003;    |             | &#10003;  |           |           |           |
| ~~`RevisionDatesDmEntity`~~                   | &#10003; |          | &#10003;    |             | &#10003;  |           | &#10003;  |           |
| ~~`RevisionEntity`~~                          | &#10003; |          | &#10003;    | &#10003;    | &#10003;  | &#10003;  |           |           |
| ~~`RevisionDmEntity`~~                        | &#10003; |          | &#10003;    | &#10003;    | &#10003;  | &#10003;  | &#10003;  | &#10003;  |
| ~~`BaseOccEntity`~~                           | &#10003; | &#10003; |             |             |           |           |           |           |
| ~~`RevisionDatesOccEntity`~~                  | &#10003; | &#10003; | &#10003;    |             | &#10003;  |           |           |           |
| ~~`RevisionDatesDmOccEntity`~~                | &#10003; | &#10003; | &#10003;    |             | &#10003;  |           | &#10003;  |           |
| ~~`RevisionOccEntity`~~                       | &#10003; | &#10003; | &#10003;    | &#10003;    | &#10003;  | &#10003;  |           |           |
| ~~`RevisionDmOccEntity`~~                     | &#10003; | &#10003; | &#10003;    | &#10003;    | &#10003;  | &#10003;  | &#10003;  | &#10003;  |

~~`Entity`~~ = Deprecated

## Configuration

To provide own configuration you need to add a property file named `coodoo.jpa-essentials.properties` to your project. This file gets read on JavaEE server startup if available or manually by calling `JpaEssentialsConfig.loadProperties()`;

You can find a template [here](https://github.com/coodoo-io/coodoo-listing/tree/master/src/main/resources/example.coodoo.listing.properties)

## Changelog

All release changes can be viewed on our [changelog](./CHANGELOG.md).

## Maintainers

[coodoo](https://github.com/orgs/coodoo-io/people)

## Contribute

Pull requests and [issues](https://github.com/coodoo-io/coodoo-jpa-essentials/issues) are welcome.

## License

[MIT © coodoo GmbH](./LICENSE)

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

Add the following dependency to your project ([published on Maven Central](http://search.maven.org/#artifactdetails%7Cio.coodoo%7Ccoodoo-jpa-essentials%7C1.0.1%7Cjar)):

```xml
<dependency>
    <groupId>io.coodoo</groupId>
    <artifactId>coodoo-jpa-essentials</artifactId>
    <version>1.0.1</version>
</dependency>
```

## Usage

Following example will not only provide you an `@Id` annotated field, but also the revision field that will store the timestamp of the creation and updates:

```java
import io.coodoo.framework.jpa.boundary.entity.AbstractRevisionDatesEntity;

@Entity
public class SomeEntity extends AbstractRevisionDatesEntity {

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

Since it is the most used identifier the root identification entity `AbstractEntity` comes with an auto incremental `Long` named `id`.

### Optimistic concurrency control 

The root of the OCC entities `AbstractVersionEntity` comes with an `@Version` annotated `Integer` named `version`.

### Revision entities

All revision entities are using either the `AbstractEntity` or the `AbstractVersionEntity` super class. So they all come with the `id` field and if they are named something like "Version", also the `version` field.

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

### Entities

| Entity                                           | ID       | OCC      | Creation Date | Creation User | Update Date | Update User | Deletion Date | Deletion User |
|--------------------------------------------------|:--------:|:--------:|:-------------:|:-------------:|:-----------:|:-----------:|:-------------:|:-------------:|
| `AbstractEntity`                                 | &#10003; |          |               |               |             |             |               |               |
| `AbstractRevisionDatesEntity`                    | &#10003; |          |    &#10003;   |               |   &#10003;  |             |               |               |
| `AbstractRevisionDatesDeleteMarkerEntity`        | &#10003; |          |    &#10003;   |               |   &#10003;  |             |   &#10003;    |               |
| `AbstractRevisionEntity`                         | &#10003; |          |    &#10003;   |    &#10003;   |   &#10003;  |   &#10003;  |               |               |
| `AbstractRevisionDeleteMarkerEntity`             | &#10003; |          |    &#10003;   |    &#10003;   |   &#10003;  |   &#10003;  |   &#10003;    |   &#10003;    |
| `AbstractVersionEntity`                          | &#10003; | &#10003; |               |               |             |             |               |               |
| `AbstractVersionRevisionDatesEntity`             | &#10003; | &#10003; |    &#10003;   |               |   &#10003;  |             |               |               |
| `AbstractVersionRevisionDatesDeleteMarkerEntity` | &#10003; | &#10003; |    &#10003;   |               |   &#10003;  |             |   &#10003;    |               |
| `AbstractVersionRevisionEntity`                  | &#10003; | &#10003; |    &#10003;   |    &#10003;   |   &#10003;  |   &#10003;  |               |               |
| `AbstractVersionRevisionDeleteMarkerEntity`      | &#10003; | &#10003; |    &#10003;   |    &#10003;   |   &#10003;  |   &#10003;  |   &#10003;    |   &#10003;    |


### Fields

| Field       | ID     | OCC       | Creation Date   | Creation User   | Update Date     | Update User   | Deletion Date   | Deletion User   |
|-------------|--------|-----------|-----------------|-----------------|-----------------|---------------|-----------------|-----------------|
| Name        | `id`   | `version` | `createdAt`     | `createdBy`     | `updatedAt`     | `updatedBy`   | `deletedAt`     | `deletedBy`     |
| Type        | `Long` | `Integer` | `LocalDateTime` | `Long`          | `LocalDateTime` | `Long`        | `LocalDateTime` | `Long`          |
| Column      | `id`   | `version` | `created_at`    | `created_by`    | `updated_at`    | `updated_by`  | `deleted_at`    | `deleted_by`    |


## Changelog

All release changes can be viewed on our [changelog](./CHANGELOG.md).

## Maintainers

[coodoo](https://github.com/orgs/coodoo-io/people)

## Contribute

Pull requests and [issues](https://github.com/coodoo-io/coodoo-jpa-essentials/issues) are welcome.

## License

[MIT © coodoo GmbH](./LICENSE)

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

Add the following dependency to your project ([published on Maven Central](http://search.maven.org/#artifactdetails%7Cio.coodoo%7Ccoodoo-jpa-essentials%7C0.1.0%7Cjar)):

```xml
<dependency>
    <groupId>io.coodoo</groupId>
    <artifactId>coodoo-jpa-essentials</artifactId>
    <version>0.1.0</version>
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

### Revision entities

All revision entities are using the `AbstractEntity` super class, so they all come with the `id` field.

You can basically distinguish the revision option in create/update timestamps, paired with the responsible user and "marked as deleted" flags.

To provide the user ID (currently only type `Long` by the same reasons like the identifier) you have to implement the interface `RevisionUser` where ever you get your current users ID from.


| Entity                                    | Creation Date | Creation User | Update Date | Update User | Delete Date | Delete User |
|-------------------------------------------|:-------------:|:-------------:|:-----------:|:-----------:|:-----------:|:-----------:|
| `AbstractRevisionDatesEntity`             |       X       |               |      X      |             |             |             |
| `AbstractRevisionDatesDeleteMarkerEntity` |       X       |               |      X      |             |      X      |             |
| `AbstractRevisionEntity`                  |       X       |       X       |      X      |      X      |             |             |
| `AbstractRevisionDeleteMarkerEntity`      |       X       |       X       |      X      |      X      |      X      |      X      |


### Fields

| Fields      | ID     | Creation Date   | Creation User   | Update Date     | Update User   | Deletion Date   | Deletion User   |
|-------------|--------|-----------------|-----------------|-----------------|---------------|-----------------|-----------------|
| Name        | `id`   | `createdAt`     | `createdBy`     | `updatedAt`     | `updatedBy`   | `deletedAt`     | `deletedBy`     |
| Type        | `Long` | `LocalDateTime` | `Long`          | `LocalDateTime` | `Long`        | `LocalDateTime` | `Long`          |
| Column      | `id`   | `created_at`    | `created_by`    | `updated_at`    | `updated_by`  | `deleted_at`    | `deleted_by`    |


## Changelog

All release changes can be viewed on our [changelog](./CHANGELOG.md).

## Maintainers

[Markus Kühle](https://github.com/mkuehle)

[Arend Kühle](https://github.com/laugen)

## Contribute

Pull requests and [issues](https://github.com/coodoo-io/coodoo-jpa-essentials/issues) are welcome.

## License

[MIT © coodoo GmbH](./LICENSE)
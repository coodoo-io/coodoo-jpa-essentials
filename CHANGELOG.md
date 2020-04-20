

<!--
### Bug Fixes
### Features
### BREAKING CHANGES
-->

<a name="1.2.0"></a>

## 1.2.0 (2020-03-31)

### Features

 * There is no EJB (`javax.ejb.*`) anymore!
 * Changed the package structure to a more BCEish pattern. The old package structure and classes remain but are marked as deprecated and the future is uncertain for them. All new entities come with a matching class.

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


<a name="1.1.1"></a>

## 1.1.1 (2018-12-12)

### Features

 * Configuration via properties file (coodoo.jpa-essentials.properties)
 * Configuration static loader

<a name="1.1.0"></a>

## 1.1.0 (2017-05-09)

### Features

* Added abstract optimistic concurrency control entities (`*OccEntity.java`)
* There are DTOs for all entities

### BREAKING CHANGES

* Renamed all entities

<a name="1.0.0"></a>

## 1.0.0 (2017-04-28)

### Bug Fixes

* Made `@Inject RevisionUser` optional by using `Instance`
* Changed JPA event listener `@PostPersist` to `@PrePersist` for create-events

<a name="0.1.0"></a>

## 0.1.0 (2017-04-25)

### Features

Initial release:

* Basic identification entity `AbstractEntity`
* Basic revision entities `AbstractRevisionDatesEntity`, `AbstractRevisionDatesDeleteMarkerEntity`, `AbstractRevisionEntity` & `AbstractRevisionDeleteMarkerEntity`
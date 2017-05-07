

<!--
### Bug Fixes
### Features
### BREAKING CHANGES
-->

<a name="1.0.1"></a>

## 1.0.1 (2017-05-08)

### Features

* Added abstract optimistic concurrency control entities

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
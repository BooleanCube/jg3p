# jg3p
> Java Library for Computer Graphics and 3D Physics. 3D Physics tools for graphic applications and simulations.

I have been developing many games using Unity and other popular game engines. However, I have recently started thinking about creating my own game engine which inspired this project to come into play. JG3P is a 3D physics library written in Java for any Java Graphics API Developers including myself to aid in their development.

## Features
- 3D Body Simulation
- Static Universal Constants
- Gravity Forces Accounted
- External Forces Accounted
- Create an n-body simulation according to the laws of 3D kinematics.

## Documentation
[ Will be generated and hosted soon ]

## Installation
[![](https://jitpack.io/v/BooleanCube/jg3p.svg)](https://jitpack.io/#BooleanCube/jg3p)

Latest Releases: https://github.com/BooleanCube/jg3p/releases

Replace `VERSION` with the latest release in Jitpack. If you want to use SNAPSHOTS, please follow the instructions on the [Jitpack page](https://jitpack.io/#BooleanCube/jg3p).

### Maven
#### Dependency
```xml
<dependencies>
    <dependency>
        <groupId>com.github.BooleanCube</groupId>
        <artifactId>jg3p</artifactId>
        <version>VERSION</version>
    </dependency>
</dependencies>
```
#### Repository
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

### Gradle
#### Dependency
```gradle
dependencies {
    implementation 'com.github.BooleanCube:jg3p:VERSION'
}
```
#### Repository
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

----

*Created by BooleanCube :]*

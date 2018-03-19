## KHttp Extensions for RxJava
[![Kotlin](https://img.shields.io/badge/Kotlin-1.1.51-blue.svg?style=flat-square)](http://kotlinlang.org)
[![RxJava](https://img.shields.io/badge/RxJava-2.1.10-b7178c.svg?style=flat-square)](https://github.com/ReactiveX/RxJava/releases/tag/v2.1.10)
[![KHttp](https://img.shields.io/badge/khttp-94ddc37-blue.svg?style=flat-square)](https://github.com/jkcclemens/khttp/commit/94ddc375f77f6b8b4bffd5415f136fe31fc663ae)
[![Build Status](https://img.shields.io/travis/Karn/khttp-rxjava.svg?style=flat-square)](https://travis-ci.org/Karn/khttp-rxjava)
[![Current Release](https://img.shields.io/badge/latest_release-snapshot-lightgrey.svg?style=flat-square)](/karn/khttp-rxjava/tree/master)

Reactive extensions for KHttp

###### GETTING STARTED
You can install these reactive extensions using Jitpack.

Currently there is only a snapshot available as test coverage is improved.

``` Groovy
// Project level build.gradle
// ...
repositories {
    maven { url 'https://jitpack.io' }
}
// ...

// Module level build.gradle
dependencies {
    // or 'compile' if in Java-land.
    implementation "com.github.karn:khttp-rxjava:-SNAPSHOT"
}
```

###### USAGE
The most basic case is as follows:

``` kotlin
get("http://httpbin.org/get")
    .subscribe { response: Response?, error: Throwable? ->
        if (error != null) {
            // Handle Error here
            return@subscribe
        }

        when (response?.statusCode) {
            200 -> System.out.print("Status OK")
            else -> System.out.print("Status not OK.")
        }
    }
```

###### CONTRIBUTING
There are many ways to [contribute](./.github/CONTRIBUTING.md), you can
- submit bugs,
- help track issues,
- review code changes.
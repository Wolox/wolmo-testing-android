[![Release](https://jitpack.io/v/Wolox/wolmo-testing-android.svg)](https://jitpack.io/v/Wolox/wolmo-testing-android.svg)

<p align="center">
<img height="140px" width="400px" src="https://user-images.githubusercontent.com/50247351/152792701-c5be5057-15e7-4377-a383-9dd17c827129.png"/>
</p>

# <a name="topic-title"></a> Wolmo Testing Android

This module provides a suite of methods to improve the process of writing instrumentation tests with [Espresso](https://developer.android.com/training/testing/espresso), while also providing implementations to support fragment testing with [Hilt](https://dagger.dev/hilt/).

## <a name="topic-installation"></a> Installation

### Gradle

First, add this at the end of your root build.gradle:

```groovy
allprojects {
  repositories {
    maven { url 'https://jitpack.io' }
  }
}
```

Then, add the dependency in your module's build.gradle:

```groovy
androidTestImplementation "com.github.Wolox:wolmo-testing-android:$wolmo_testing_version"
```

## <a name="topic-contributing"></a> Contributing

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push your branch (`git push origin my-new-feature`)
5. Create a new Pull Request

## <a name="topic-about"></a> About

This project is developed and maintained by [Wolox](http://www.wolox.com.ar).

<img height="118px" width="426px" src="https://user-images.githubusercontent.com/50247351/146973273-9cca946f-4811-44f4-9e00-53dd0e3ec120.png"/>

## <a name="topic-license"></a> License

**Wolmo Testing Android** is available under the MIT [license](https://raw.githubusercontent.com/Wolox/wolmo-testing-android/main/LICENSE.md).

    Copyright (c) Wolox S.A

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.

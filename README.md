# Fragment-Transaction-Animation

This repo will introduce to how  make fragment transaction animation like that:

![](https://github.com/yendangn/Fragment-Transaction-Animation/blob/master/image/video_demo.gif)

# Step by Step:

## Step 1: Replace fragment
When replace FragmentTow, we will custom setCustomAnimations method as below:

```Java
private void showFragmentTwo() {

        Fragment fragmentTwo = new FragmentTwo();

        getActivity().getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit)
                .replace(R.id.container, fragmentTwo)
                .addToBackStack("FragmentTwo")
                .commit();

    }
```

## Step 2: Create animation files
At res/anim, we will create 4 animation files:

1. enter.xml

```xml
<?xml version="1.0" encoding="utf-8"?>
<set>
    <translate xmlns:android="http://schemas.android.com/apk/res/android"
        android:duration="@android:integer/config_mediumAnimTime"
        android:fromXDelta="100%"
        android:interpolator="@android:anim/decelerate_interpolator"
        android:toXDelta="0" />
</set>
```

2. exit.xml

```xml
<set>
    <translate xmlns:android="http://schemas.android.com/apk/res/android"
        android:duration="@android:integer/config_mediumAnimTime"
        android:fromXDelta="0"
        android:interpolator="@android:anim/accelerate_interpolator"
        android:toXDelta="-100%" />
</set>
```

3. pop_enter.xml

```xml
<set>
    <translate xmlns:android="http://schemas.android.com/apk/res/android"
        android:duration="@android:integer/config_mediumAnimTime"
        android:fromXDelta="-100%"
        android:interpolator="@android:anim/decelerate_interpolator"
        android:toXDelta="0" />
</set>
```

4. pop_exit.xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<set>
    <translate xmlns:android="http://schemas.android.com/apk/res/android"
        android:duration="@android:integer/config_mediumAnimTime"
        android:fromXDelta="0"
        android:interpolator="@android:anim/accelerate_interpolator"
        android:toXDelta="100%" />
</set>
```

## Done, happy coding

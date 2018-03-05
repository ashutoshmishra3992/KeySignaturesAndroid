# KeySignaturesAndroid
KeySignaturesAndroid for getting SHA1 and MD5

Supported Android versions: Android 5.0+

Adding to your project

Add it in your root build.gradle at the end of repositories:
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Add the dependency:
dependencies {
	       compile 'com.github.ashutoshmdev:KeySignaturesAndroid:1.1'
}

For SHA1:
KeySignatures.getSHA1(mContext);

For MD5:
KeySignatures.getMD5(mContext);
 

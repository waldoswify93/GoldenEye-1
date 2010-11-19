 /* hello-jni.i */
 %module GoldenEye
 %{
        extern const char * convertToGreyScale(const char *inputImgPath);
        extern const char * detectFaces(const char *inputImgPath);
       	extern void init(const char * haarClassifierXml, const char * outputImgFolder);
       	extern void destroy();
 %}	
 


%pragma(java) jniclasscode=%{
  static {
    try {
  	     System.loadLibrary("goldeneye");
    } catch (UnsatisfiedLinkError e) {
    	throw e;
    }
  }
%}

extern const char * convertToGreyScale(const char *inputImgPath);
extern const char * detectFaces(const char *inputImgPath);
extern void init(const char * haarClassifierXml, const char * outputImgFolder);
extern void destroy();
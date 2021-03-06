/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.android.goldeneye.core;

public class GoldenEye {
  public static String convertToGreyScale(String inputImgPath) {
    return GoldenEyeJNI.convertToGreyScale(inputImgPath);
  }

  public static String detectFaces(String inputImgPath) {
    return GoldenEyeJNI.detectFaces(inputImgPath);
  }

  public static int train(String name, int numImages, String imgPathPrefix) {
    return GoldenEyeJNI.train(name, numImages, imgPathPrefix);
  }

  public static String recognizeFace(String inputImgPath, String outputImgPath) {
    return GoldenEyeJNI.recognizeFace(inputImgPath, outputImgPath);
  }

  public static void init(String haarClassifierXml, String outputFolder, String imgExtension) {
    GoldenEyeJNI.init(haarClassifierXml, outputFolder, imgExtension);
  }

  public static void destroy() {
    GoldenEyeJNI.destroy();
  }

}

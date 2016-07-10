LOCAL_PATH := $(call my-dir)
  include $(CLEAR_VARS)
   
  # Build all java files in the java subdirectory-->直译（建立在java子目录中的所有Java文件）
  LOCAL_SRC_FILES := $(call all-subdir-java-files)
   
  # Name of the APK to build-->直译（创建APK的名称）
  LOCAL_PACKAGE_NAME := CM13thanks
   
  # Tell it to build an APK-->直译（告诉它来建立一个APK）
  include $(BUILD_PACKAGE)

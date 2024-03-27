package com.app.Junit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses(com.app.Junit.IncludeExcludeTags.class)
@IncludeTags("development")
public class JUnit5Runner {

}

/*
 * Copyright 2012-2015 CodeLibs Project and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.codelibs.fess.app.web.admin.joblog;

import java.io.Serializable;

import javax.validation.constraints.Digits;

import org.lastaflute.web.validation.Required;

/**
 * @author codelibs
 * @author Shunji Makino
 */
public class EditForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @Digits(integer = 10, fraction = 0)
    public int crudMode;

    @Required
    @Digits(integer = 19, fraction = 0)
    public String id;

    @Required
    public String jobName;

    @Required
    public String jobStatus;

    @Required
    public String target;

    @Required
    public String scriptType;

    public String scriptData;

    public String scriptResult;

    @Required
    public String startTime;

    public String endTime;

    public void initialize() {
        id = null;
        jobName = null;
        jobStatus = null;
        target = null;
        scriptType = null;
        scriptData = null;
        scriptResult = null;
        startTime = null;
        endTime = null;
    }
}
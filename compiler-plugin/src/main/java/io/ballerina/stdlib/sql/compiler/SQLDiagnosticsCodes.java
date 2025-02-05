/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.ballerina.stdlib.sql.compiler;

import io.ballerina.tools.diagnostics.DiagnosticSeverity;

import static io.ballerina.tools.diagnostics.DiagnosticSeverity.ERROR;
import static io.ballerina.tools.diagnostics.DiagnosticSeverity.HINT;

/**
 * Enum class to hold SQL module diagnostic codes.
 */
public enum SQLDiagnosticsCodes {
    SQL_101("SQL_101", "invalid value: expected value is greater than one", ERROR),
    SQL_102("SQL_102", "invalid value: expected value is greater than zero", ERROR),
    SQL_103("SQL_103", "invalid value: expected value is either 0 or greater than or equal to 30", ERROR),

    // Out parameter return type validations diagnostics
    SQL_201("SQL_201", "invalid value: expected value is array", ERROR),
    SQL_202("SQL_202", "invalid value: expected value is record", ERROR),
    SQL_203("SQL_203", "invalid value: expected value is xml", ERROR),
    SQL_204("SQL_204", "invalid value: expected value is byte[]", ERROR),
    SQL_211("SQL_211", "invalid value: expected value is either string or json", ERROR),
    SQL_212("SQL_212", "invalid value: expected value is either byte[] or string", ERROR),
    SQL_213("SQL_213", "invalid value: expected value is either int or string", ERROR),
    SQL_214("SQL_214", "invalid value: expected value is either float or string", ERROR),
    SQL_215("SQL_215", "invalid value: expected value is either decimal or string", ERROR),
    SQL_221("SQL_221", "invalid value: expected value is any one of boolean, int or string", ERROR),
    SQL_222("SQL_222", "invalid value: expected value is any one of time:Date, int or string", ERROR),
    SQL_223("SQL_223", "invalid value: expected value is any one of time:TimeOfDay, int or string", ERROR),
    SQL_231("SQL_231", "invalid value: expected value is any one of time:Civil, time:Utc, int or string", ERROR),

    SQL_901("SQL_901", "parameter 'typeDesc' should be explicitly passed when the return data is ignored", HINT);

    private final String code;
    private final String message;
    private final DiagnosticSeverity severity;

    SQLDiagnosticsCodes(String code, String message, DiagnosticSeverity severity) {
        this.code = code;
        this.message = message;
        this.severity = severity;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public DiagnosticSeverity getSeverity() {
        return severity;
    }

}

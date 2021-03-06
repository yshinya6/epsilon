package synthesizer;


public interface NameSample {
	static final String[] VarNameList = { "i", "value", "name", "result", "context", "key", "message", "type", "id", "out", "serialVersionUID", "index", "request", "s", "c", "in", "conf", "data", "path", "e", "input", "msg", "node", "args", "response",
			"t", "b", "o", "p", "val", "event", "obj", "r", "LOG", "ctx", "session", "query", "config", "builder", "size", "x", "writer", "v", "file", "parent", "j", "count", "expected", "logger", "sb", "log", "list", "reader", "conn", "url", "other",
			"start", "length", "props", "source", "n", "factory", "map", "buffer", "field", "properties", "m", "a", "offset", "target", "uri", "client", "attr", "options", "entry", "f", "cache", "state", "doc", "params", "object", "host", "element",
			"port", "res", "user", "values", "connection", "table", "output", "it", "op", "iter", "rs", "method", "cause", "bytes", "filter", "len", "exchange" };
	static final String[] IntegerVarNames = { "dmax", "DOWN_MASKS", "rgb", "startOff", "bracket", "startOffset", "scanLine", "length", "pixel", "floatBits", "samples", "indents", "recordCount", "zigZag", "d", "numGroups", "bits", "dims", "bitsPerSample",
			"certainty", "bands", "iData", "size", "currentDoc", "reads", "instanceCount", "iResult", "propertyPK", "expectedCount", "posInc", "levels", "k", "m", "pix", "dstData", "dx", "methodModifiers", "scanline", "payloadByteUpto", "$result",
			"replicas", "numkeys", "count", "minLengths", "numInstances", "curX", "TRAILER_SIZE", "maxPassages", "maxs", "visits", "roll", "start", "reverseMul", "posBufferUpto", "index", "copies", "NUM_KV", "rp", "jdbcTypeId", "numBits", "year",
			"digits", "fieldModifiers", "inc", "counter", "value", "pos", "failures", "i", "endOffset", "updateCount", "numHits", "mins", "skipInterval", "port", "posIncr", "remainder", "oldIdx", "dim", "ops", "remainingBytes", "mddClass",
			"AUDT_INPUT_NULL", "cross", "expBlocksNone", "pageToShow", "deltaStackLength", "expectedInvocationCount", "PART_UNIT", "SERVERSTARTCODE_FIELD_NUMBER", "_nextSid", "foldersPerFolders", "minUnionSize", "READY_TO_SPLIT_VALUE",
			"DEFAULT_CONCURRENT_WARMUP_ROUNDS", "_zookeeperSessionTimeout", "m_indentAmount", "itemCacheSize", "MPEG_V2", "numUniqueRanges", };
	static final String[] BooleanVarNames = { "methodFound", "rtn", "safe", "done", "isToken", "isServerSide", "started", "failed", "fail", "success", "succeed", "needsUpperCase", "asErrors", "ok", "propertyChangeFlag", "seen", "first", "completed",
			"fieldFound", "dropped", "exists", "isHex", "scheduled", "wasKilling", "quietESet", "resourceRequireExplicitRegistration", "present_localSubmission", "rewriteCalls", "isWiredIn", "iccSequenceStarted", "vMemEnabled", "that_present_partNames",
			"needsResolve", "threadBStartedTestBlocksUntilRelease", "signedEndorsingSupportingTokenOccured", "isMultiDisbursal", "enableMajorCompaction", "configResult", "crossesRegionBoundary", "needsTimestamps", "dimensionsExistInQuery", "inArray",
			"isSoapMessage", "alreadyGotReplyTooShort", "foundPreviousRow", "logInflightExchangesOnTimeout", "doFullRefresh", "heartbeatBackgroundEnabled", "DEFAULT_AMQP_WANT_CLIENT_AUTH", "bundleVersionCorrect", "useTrash", "cancelActive", "notifyHigh",
			"sendCheckpoint", "enableScrolly", "isSemiJoin", "isCenterCollection", "textCountEmptyLinesValue", "appContextProtection", "useNullValue", "useAuthentication", "allowPositive", "isBeanAnnotation", "isCheck", "isBasicType",
			"connectSequentially", "hasPlexusHome", "isColumnRelative", "logAsString", "DO_CLOSE_PRIMARY", "createNewBags", "needsMapStack", "orRequired", "typeOK", "isIndexId", "defaultDynamicManagement", "anonymous", "manageNameDfsDirs",
			"simulateSlowReader", "isReplayState", "DO_BIT_FLIPS_DURING_COPY", "oldMerge", "postCompleteMode", "isAdjusting", "inSetup", "mtomEnabled", "lastWasDash", "returnNullWhenBufferIsFull", "processedDefault", "toggleButton",
			"hideReservationQueues", "this_present_keyValue", "compileMe", "callServiceFound", "sqlSelectDistinct", "autoRejoin", "natNow", "getNextRecord", "lockForInsertPreviousKey", "nonBlocking", };
	static final String[] StringVarNames = { "ns", "afn", "keyType", "signature", "ALPHABET", "value1", "Name", "accepts", "title", "zookeepers", "bitVectors", "executionTimeFilePath", "contents", "id1", "temp", "fileName", "protocols", "filesString",
			"opSignature", "lun", "charset", "CREATE_TABLE", "rack1", "arg", "iterationVector", "purpose", "nsp", "pargs", "methodName", "test1", "nameValue", "types", "nm", "tableName", "xmlString", "userNames", "handlerName", "docText", "origPath",
			"fieldName", "ciphers", "timeStr", "rack3", "stringArray", "testScript", "mname", "hp", "lang", "memName", "host", "url", "tests", "hostPort", "output", "rack2", "options", "descr", "algorithmName", "DATA", "CONFIG1", "newPath", "fmt",
			"VARIABLE_NAMES", "test2", "test3", "noteName", "PATH", "dates", "query", "commentText", "rV", "roleTypeId", "expectedOutput", "bind", "name", "subpath", "cmd", "extracted", "resultPath", "attName", "dupProperty", "value2", "str", "RUN_MODES",
			"testData", "errorMessage", "SYSTEM", "rackHostName", "classpath", "query2", "storedPassword", "expected", "expectedBody1", "search", "shellCommand", "blobNamePrivate", "bodyText", "TEXT_163", "FXG_LINEHEIGHT_ATTRIBUTE",
			"V2SIGTESTSURL_RESOURCEURL_SIGRENDER_FIELDFULL", };
	static final String[] StringValues = { "newDocs", "NULL_VALUE_TOKEN", "GlobalMapperSystemProperty1", "varNameRegex", "SET_COOKIE", "OnlyDeny", "primaryNotice", "SAMPLER_FRACTION_CONF_KEY", "NETEZZA_CTRL_CHARS_OPT", "expectedValues1",
			"QNAME_TABLE_PARENT_QNAME_COLUMN_NAME", "stepString", "behaviorClassName", "V2DISPATCHERTESTS2_SPEC2_19_FORWARDJSPACTION_ATTRIBUTES2A", "lbStatsPort", "ldapSyntaxOid", "GROUP_MEMBER_PROVISION_TASKJOB", "logDirsString", "expectedCsvContents1",
			"allowTransactionsOnHolidayProperty", "coordPathStr", "STACK_VERSION_PROPERTY_ID", "PARAM_REFER", "QPID_MAX_SIZE", "ATTR_JETTY_CONTAINER_INCLUDE_JAR_PATTERN", "FUNC_TABLE", "contextEntryId", "DELETE_ALL_BY_INTERVAL", "automationID",
			"WRONG_PARAMETER", "REFID_PROPERTY_HELPER", "allowUpDownOnRight", "myNonStaticInnerField", "configurationsString", "MAVEN_PLUGIN", "checksumUrl", "middleInitial", "ERROR_0011", "ctString", "protoMessageClassName", "finalMethod",
			"cookbookArchiveUrl", "wildcardPattern", "partitionAlgorithm", "soapContentType", "ATMOST_ONCE_MSG_SEMANTICS", "UI_URL", "voyageNumber", "TWILL_RESERVED_MEMORY_MB", "hierarchyName", "DESCRIBE_COMMAND", "DEFAULT_CLOUD_SOLR_XML",
			"BORDER_STYLE_RIDGE", "LINKS_INLINKS_HOST", "keyEncryptionAlgorithm", "memberIdString", "errDiagDagEvent", "LOG4J_DEFAULT_STATUS_LEVEL", "originalProxyPassword", "paymentMethodTypeId", "trimmedDestinationValue", "mappingFileName",
			"httpHeader", "confluencePassword", "nsMonitorName", "DEFAULT_IMAGE_FORMAT", "mbind", "BLOB_COLUMN_PROPERTY", "INLINE_IMAGE_BEGIN", "ORGANIZATION_ARG", "FXG_SOLIDCOLORSTROKE_ELEMENT", "confpath", "aggInstructionsInReducer", "proxyPrimary",
			"XLINK_ROLE", "jaas_section", "ICON_ChangeNodeViewers", "MBEAN_ATTRIBUTE_JVMPAUSES", "codecSubstring", "SQOOP_OPTIONS", "DEVICE_ENTITY_TYPE", "SYSLOG_SEVERITY", "mappedValueName", "providerOrApi", "diffAlgo", "TEXT_1046", "errMsg0",
			"targetGroupName", "DUMMY_YARN_RUNTIME", "DEFAULT_REFRESH_KEY", "QRCODE_DEFAULT_HEIGHT", "V2RESPONSETESTS_STATEAWARERESPONSE_APIEVENT_SETEVENTB2", "MR_QUEUE_NAME", "CLASS_DOWNLOADPROGRESSBAR", "LIST_MEMBER__MSG__NO_MEMBER_FOUND",
			"nonEmptyInputPath", "curEntryBaseRelativePath", "TEST_RESOURCES_PATH", "m_rawMemberName", "LIBRARY_DIRECTORY", "createSeqEntryNotFound", "taregtExecuteEndpoint", "externalUserId", "_2_0_PACKAGE_PREFIX", "TEARDOWN", "messageSerialization",
			"nwPartitionId", "DEPOSIT_HEADERS_CONFIG", "DFA8_acceptS", "uuidTrimmed", "V2URLTESTS_BASEURL_APIRENDERRENURL_SETPARAMETERB6", "classTypeDisplayName", "operIdDelRepo", "V2ADDLREQUESTTESTS_SPEC2_11_RESOURCE_PARAMETERS6", "IP_LIST",
			"stratosBackendURL", "MAX_ITERATIONS_OPTION", "REPOSITORY_REFERNENCE_NAME", "EXPECTED_METADATA_NO_USERPREFS_RESPONSE", "BATCHEE_XML", "publicIpAddressId", "checkToken", "SUCCESSFUL_API_QUERIES", "resoureName", "AMF_CALL_FAILED_CODE",
			"DEFAULT_CLUSTER_USER", "userJarFile", "expectedError_SUN", "EMAIL_KIND", "columnC1value", "transferService", "MAP_STATUS_KEY", "OPENEJB_LOCALCOPY", "thePrompt", "stateModelRef", "DROPPED_DUE_TO_LATENESS_COUNTER", "macSecret",
			"REG_PROPERTY_ENDPOINTS", "additionalPolicyResource", "nillableProperty", "intTestArg", "hopFilter", "V2SIGTESTSEXCEPTION_READONLYEXCEPTION_SIGRENDER_CONSTRUCTORA", "ADS_CACHE_SCHEMA_FILE", "NO_ACCESS_MESSAGE_DATABASE", "functionKind",
			"PORT_SUFFIX", "completeArea", "aTopLevelServiceBrokerURI", "BROWSER_USER_AGENT_PARAM", "pooledConnType", "OPEN_COMPONENT_MSG", "OUTPUT_STREAM_HOLDER", "stdoutFilePath", "CAMEL_PROPERTY_NAME", "TRANSITION_TO", "locationSpec",
			"FXG_COLORWITHENUM_TRANSPARENT_VALUE", "CENTER_URL", "timeDimColumn", "sudoGroupName", "snapshotFullOVAName", "START_JCONSOLE__CATCH_ALL_ERROR_MESSAGE", "STATIC_WEB_LISTINGS_CSS", "classLoaderNotFound", "diskNameKey", "EXPECTED_SUBJECT_DN",
			"PAYLOAD_CLASS_KEY", "originHeaderValue", "configuredNameOrPattern", "suffixForGeneratedClass", "subjColumn", "PROPERTY_NO_VALUE_MSG", "WIZARD_EXPORT_EXCEL", "BLUEPRINT_HOST_GROUPS_COMPONENTS_PROPERTY", "ambariServerComponentName",
			"importTextWithSlashesInsteadOfDots", "secureRNG", "LIST_LB_VMIPS", "entryTimeToLiveAction", "KEY_READ_BUFFER_SIZE", "IMG_OCD_STRUCTURAL", "DISABLE_AUTO_WATCH_RESET", "attrsAddedLogObjSourceClass", "frozenPath", "comparatorKey", "metaName",
			"PN_HIDE_PROPERTIES", "FILESYSTEM_KEY", "DESIGN_DOC_ID1", "METRICS_AGGREGATE_MINUTE_TABLE_NAME", "resultDbName", "_contentType", "OBJECT_NAME_ACCESSCONTROL", "headerTextAsString", "PROPERTY_NAME_CONNECT_TIMEOUT", "QPID_MESSAGE_DURABILITY",
			"HTTP_CLIENT_ERROR", "CONS_NAME_BEFORE", "htmlString", };
	static final String[] FunctionNames = { "first", "seen", "scheduled", "safe", "methodFound", "success", "succeed", "done", "propertyChangeFlag", "asErrors", "needsUpperCase", "isServerSide", "isHex", "isToken", "started", "rtn", "dropped", "fail",
			"exists", "fieldFound", "failed", "completed", "isSnapshotRepair", "hasKeyConstraint", "protectIdTokenWithClientSecret", "preAcknowledge", "allowHtml", "quietESet", "allSameLoader", "queryAgainstTenantSpecificView", "field_5_fUnlocked",
			"equalParent", "isSubstitutionGroupEq", "pendingSpaces", "isCluster", "commonParentFound", "rcExists", "hasCacheAsBitmap", "isOutputStream", "fPageBreak", "yPercent", "stmtf", "saveParamsAsAttributes", "remoteLoaderInvoked",
			"synPredMatched24", "serviceStopped", "TEZ_RUNTIME_SHUFFLE_KEEP_ALIVE_ENABLED_DEFAULT", "carriesTwoByteSelectionVector_", "suppressNode", "flagChangedLo", "isNodeInMetaData", "recompressZippedFiles", "logFailure",
			"partialJmxSslConfigOverride", "DEFAULT_CANCEL_QUERY_ON_TIMEOUT", "doInstallAction", "that_present_chessisNumber", "isAllRoute", "breakOuter", "prepareDoSaveInvoked", "takeThem", "addParentPoms", "outboundStanza", "validationComplete",
			"isDurableClient", "checkEmptyString", "openNextFile", "asResolvedTree", "useIp", "forceMessageIdAsCorrelationId", "cachedImage", "showSymbolic", "that_present_triggers", "isDirectV2", "mustSupportRefEmbeddedToken", "superInPre", "boolvalue",
			"needsParity", "savedWithinBatch", "gradientLoadAverageReset", "cancelPreviousShare", "findLast", "theIgnoreDirect", "includeRelativePathSegment", "useDocSet", "filterOutOfStock", "that_present_key_seq", "monospace", "CASE_SENSITIVE_EDEFAULT",
			"valTextIdx", "virtualHardwareSupportsCpuHotAdd", "returnReferences", "disableProxyCaching", "accessed", "addRdr", "senderType", "the_end", "isWorkPreservingRecoveryEnabled", "that_present_eventType", "stopCalled", };

	static final String[] ImportClassName = { "java.util.List", "java.util.Set" };

}

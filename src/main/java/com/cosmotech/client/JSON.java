/*
 * Cosmo Tech Platform API
 * Cosmo Tech Platform API
 *
 * The version of the OpenAPI document: 3.2.2-SNAPSHOT
 * Contact: platform@cosmotech.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cosmotech.client;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.TimeZone;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    private static final StdDateFormat sdf = new StdDateFormat()
        .withTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()))
        .withColonInTimeZone(true);
    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ComponentRolePermissions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.Connector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ConnectorParameter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ConnectorParameterGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ContainerResourceSizeInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ContainerResourceSizing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.Dataset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetAccessControl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetCompatibility.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetConnector.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetCopyParameters.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetSecurity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetTwinGraphHash.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetTwinGraphInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DatasetTwinGraphQuery.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.DeleteHistoricalData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.FileUploadMetadata.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.FileUploadValidation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.GraphProperties.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.Organization.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.OrganizationAccessControl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.OrganizationRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.OrganizationSecurity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.OrganizationService.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.OrganizationServices.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.QueryResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ResourceSizeInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.Run.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunContainer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunContainerArtifact.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunContainerLogs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunDataQuery.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunLogs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunResourceRequested.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunStartContainers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunStatusNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunTemplateParameter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunTemplateParameterGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunTemplateParameterValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunTemplateResourceSizing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.Runner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerAccessControl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerChangedParameterValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerComparisonResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerDataDownloadInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerDataDownloadJob.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerLastRun.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerParentLastRun.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerResourceSizing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerRootLastRun.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerRunTemplateParameterValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.RunnerSecurity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.Scenario.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioAccessControl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioChangedParameterValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioComparisonResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioDataDownloadInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioDataDownloadJob.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioLastRun.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioResourceSizing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRun.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunContainer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunContainerArtifact.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunContainerLogs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunLogs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunResourceRequested.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunSearch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunStartContainers.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunStatusNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioRunTemplateParameterValue.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.ScenarioSecurity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.SendRunDataRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.Solution.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.SolutionAccessControl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.SolutionRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.SolutionSecurity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.SourceInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.SubDatasetGraphQuery.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.TwinGraphBatchResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.TwinGraphHash.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.TwinGraphQuery.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.Validator.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.Workspace.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.WorkspaceAccessControl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.WorkspaceFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.WorkspaceRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.WorkspaceSecret.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.WorkspaceSecurity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.WorkspaceSolution.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cosmotech.client.model.WorkspaceWebApp.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(sdf.parse(date).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, DateTimeFormatter will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toInstant().atOffset(ZoneOffset.UTC).format(dtf);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return sdf.parse(date);
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}

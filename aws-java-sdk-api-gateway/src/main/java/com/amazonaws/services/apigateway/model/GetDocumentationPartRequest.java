/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets a specified documentation part of a given API.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDocumentationPartRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     */
    private String documentationPartId;

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param restApiId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentationPartRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param documentationPartId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public void setDocumentationPartId(String documentationPartId) {
        this.documentationPartId = documentationPartId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @return [Required] The string identifier of the associated <a>RestApi</a>.
     */

    public String getDocumentationPartId() {
        return this.documentationPartId;
    }

    /**
     * <p>
     * [Required] The string identifier of the associated <a>RestApi</a>.
     * </p>
     * 
     * @param documentationPartId
     *        [Required] The string identifier of the associated <a>RestApi</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDocumentationPartRequest withDocumentationPartId(String documentationPartId) {
        setDocumentationPartId(documentationPartId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRestApiId() != null)
            sb.append("RestApiId: ").append(getRestApiId()).append(",");
        if (getDocumentationPartId() != null)
            sb.append("DocumentationPartId: ").append(getDocumentationPartId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDocumentationPartRequest == false)
            return false;
        GetDocumentationPartRequest other = (GetDocumentationPartRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getDocumentationPartId() == null ^ this.getDocumentationPartId() == null)
            return false;
        if (other.getDocumentationPartId() != null && other.getDocumentationPartId().equals(this.getDocumentationPartId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getDocumentationPartId() == null) ? 0 : getDocumentationPartId().hashCode());
        return hashCode;
    }

    @Override
    public GetDocumentationPartRequest clone() {
        return (GetDocumentationPartRequest) super.clone();
    }

}

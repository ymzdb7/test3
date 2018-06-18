package com.myoa.model.portalColumn;

import java.io.Serializable;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class TeeBaseModel
  implements Serializable
{
}


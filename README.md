springboot, json, restful Full Resource Representation

Full Resource Representation
https://www.energy.gov/sites/prod/files/2020/12/f81/code-12-15-2020.json


  "agency" : "DOE",
  "measurementType" : {
    "ifOther" : "",
    "method" : "other"
  },
  "releases" : [ {
    "contact" : {
      "email" : "jcrouch@sandia.gov"
    },
    "date" : {
      "created" : "2017-10-25",
      "metadataLastUpdated" : "2017-10-25"
    },
    "description" : "Teuchos is designed to provide portable, object-oriented tools for Trillnos developers and users. This includes templated wrappers to BLAS/LAPACK, a serial dense matrix class, a parameter list, XML parsing utilities, reference counted pointer (smart pointer) utilities, and more. These tools are designed to run on both serial and parallel computers.",
    "laborHours" : 8344830.4,
    
Partial Resource Representation


{
"organizations": [
{
"organization": "Generic Organization Name",
"release_count": 20,
"total_labor_hours": 4894,
"all_in_production": false,
"licenses": ["LGPL-2.1"],
"most_active_months": [5],
},
...
]
}

As you can see, the partial response is a significant reduction in payload size and message complexity. By allowing the consumer of the API to specify the fields they are interested in you can significantly reduce the complexity of response messages as well as improve performance over the wire.

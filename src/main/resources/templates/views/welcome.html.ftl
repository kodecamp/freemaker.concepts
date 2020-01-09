<#include "/common/header.ftl">
<#import "/common/products.util.ftl" as productUtils> 

<div class="container center">
  <div>
    <#list pageValues.products as product>
    <#-- using user defined macro -->
        <@productUtils.productDetails p=product isVertical=true
        color=(product?index%2 == 0)?then('darkgray','tomato')/> 
    </#list>
  </div>
</div>
<div style="text-align:center;">
    <#list 1..<11 as no>
      <span class="page-no">${no}</span>
    </#list>
</div>
<#-- 
<#macro productDetails p isVertical color>
  <div class='inline-box ${isVertical?then("vertical","horizontal")}' style="background:${color}">
    <p style="font-weight: bold;">${p.name}</p>
    <p>${p.url}</p>
    <p>${p.price}</p>
  </div>
</#macro>
 -->
 <#assign x = 0>
 <#list 100..110 as pos> 
   <span>${x} -> ${pos}</span>
   <#assign x+=1>
 </#list>
<#include "/common/footer.ftl">
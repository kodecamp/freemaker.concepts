<#include "/common/header.ftl">

<#-- This is user defined macro -->
<#macro productDetails p isVertical color>
  <div class='inline-box ${isVertical?then("vertical","horizontal")}' style="background:${color}">
    <p style="font-weight: bold;">${p.name}</p>
    <p>${p.url}</p>
    <p>${p.price}</p>
  </div>
</#macro>

<div class="container center">
  <div>
    <#list products as product>
    <#-- using user defined macro -->
        <@productDetails p=product isVertical=false 
        color=(product?index%2 == 0)?then('darkgray','tomato')/> 
    </#list>
  </div>
</div>
<div style="text-align:center;">
    <#list 1..<11 as no>
      <span class="page-no">${no}</span>
    </#list>
</div>

<#include "/common/footer.ftl">
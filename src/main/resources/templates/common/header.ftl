<html>
  <head>
    <title>${title!"Missing"}</title> 
    <link href="../../app.css" rel="stylesheet"/>
  </head>
  <body>
    <header>
      <h3>Logo</h3>
      <ul>
      <#list headerValues.links as link, value>
        <li>
          <a href="${value}">${link}</a>
        </li>
      </#list>
      </ul>
    </header>

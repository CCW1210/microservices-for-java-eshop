New-Item -Path "./scripts" -ItemType Directory -Force
@"
\$services = @(
  "user-service",
  "product-service",
  "order-service",
  "cart-service"
)

foreach (\$service in \$services) {
  \$path = ".\services\\\$service"
  Write-Host "正在格式化：\$service"
  if (Test-Path "\$path\mvnw") {
    Push-Location \$path
    .\mvnw spotless:apply
    Pop-Location
  } else {
    Write-Host "找不到 mvnw 略過 \$service"
  }
}
"@ | Set-Content -Path "./scripts/format-all.ps1" -Encoding UTF8

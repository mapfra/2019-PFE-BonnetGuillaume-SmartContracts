#!/bin/bash

cd ./testDsl/src-gen/
pdflatex Contract.tex
pdf_hash=$(sha256sum Contract.pdf | cut -d" " -f1)
sed -i -e 's/pdfHash/'$pdf_hash'/g' 4_contract_migration.js
cat 4_contract_migration.js

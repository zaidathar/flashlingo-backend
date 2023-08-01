# Vault Configuration

## Setup
### To install vault
https://developer.hashicorp.com/vault/tutorials/getting-started/getting-started-install
### To start vault
```shell
vault server -dev --dev-root-token-id=<Custome Token>
# Default token can be found in config file
```
### Export vault urld

```shell
export VAULT_ADDR="http://127.0.0.1:8200"
```

### To add configuration in vault
```shell
vault kv put secret/spring-vault-config <Key1>=<Value1> <Key2>=<Value2>
```


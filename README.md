## Demo - Reproducing issue

https://github.com/jobrunr/jobrunr/issues/659

## Steps to reproduce

1. Kubernetes

You need to make sure you have a kubernetes cluster running. I used minikube for this demo.

```bash
kubectl create namespace jobrunr
kubectl kustomize k8s | kubectl apply -f -

## Get the deployment name
kubectl get pods --namespace=jobrunr | grep demo-deployment-v1

## Open JobRunR dashboardk
kubectl port-forward demo-deployment-v1-XXXXXXXX 8050:8050
```

Now leave it running in a few minutes error should be there.

### Other infos

API link created:

* http://localhost:9050/tasks

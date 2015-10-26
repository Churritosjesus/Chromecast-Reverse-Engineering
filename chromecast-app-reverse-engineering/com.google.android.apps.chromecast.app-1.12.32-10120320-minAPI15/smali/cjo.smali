.class abstract Lcjo;
.super Lbwp;


# instance fields
.field final synthetic a:Lbvf;


# direct methods
.method public constructor <init>(Lbvf;Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    iput-object p1, p0, Lcjo;->a:Lbvf;

    sget-object v0, Lbvc;->a:Lbwe;

    invoke-direct {p0, v0, p2}, Lbwp;-><init>(Lbwe;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lcom/google/android/gms/common/api/Status;)Lbwm;
    .locals 2

    .prologue
    .line 0
    .line 1000
    new-instance v0, Lcjq;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcjq;-><init>(Lcjo;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/common/api/Status;)V

    .line 0
    return-object v0
.end method

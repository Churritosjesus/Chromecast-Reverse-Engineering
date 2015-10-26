.class public final Lcjp;
.super Lcjk;


# instance fields
.field private synthetic a:Lcjo;


# direct methods
.method protected constructor <init>(Lcjo;)V
    .locals 1

    .prologue
    .line 0
    iput-object p1, p0, Lcjp;->a:Lcjo;

    iget-object v0, p1, Lcjo;->a:Lbvf;

    .line 1000
    invoke-direct {p0, v0}, Lcjk;-><init>(Lbvf;)V

    .line 0
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 5

    iget-object v0, p0, Lcjp;->a:Lcjo;

    new-instance v1, Lcjq;

    iget-object v2, p0, Lcjp;->a:Lcjo;

    const/4 v3, 0x0

    new-instance v4, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v4, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v1, v2, v3, v4}, Lcjq;-><init>(Lcjo;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcjo;->a(Lbwm;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/cast/CastDevice;)V
    .locals 5

    iget-object v0, p0, Lcjp;->a:Lcjo;

    new-instance v1, Lcjq;

    iget-object v2, p0, Lcjp;->a:Lcjo;

    new-instance v3, Lcom/google/android/gms/common/api/Status;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v1, v2, p1, v3}, Lcjq;-><init>(Lcjo;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcjo;->a(Lbwm;)V

    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Lcjp;->a:Lcjo;

    new-instance v1, Lcjq;

    iget-object v2, p0, Lcjp;->a:Lcjo;

    const/4 v3, 0x0

    new-instance v4, Lcom/google/android/gms/common/api/Status;

    const/16 v5, 0x7d5

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v1, v2, v3, v4}, Lcjq;-><init>(Lcjo;Lcom/google/android/gms/cast/CastDevice;Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v0, v1}, Lcjo;->a(Lbwm;)V

    return-void
.end method

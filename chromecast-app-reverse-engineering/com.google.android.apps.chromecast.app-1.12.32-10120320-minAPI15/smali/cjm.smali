.class public final Lcjm;
.super Lcjk;


# instance fields
.field private synthetic a:Lcjl;


# direct methods
.method protected constructor <init>(Lcjl;)V
    .locals 1

    .prologue
    .line 0
    iput-object p1, p0, Lcjm;->a:Lcjl;

    iget-object v0, p1, Lcjl;->a:Lbvf;

    .line 1000
    invoke-direct {p0, v0}, Lcjk;-><init>(Lbvf;)V

    .line 0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcjm;->a:Lcjl;

    sget-object v1, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v1}, Lcjl;->a(Lbwm;)V

    return-void
.end method

.method public final a(I)V
    .locals 2

    iget-object v0, p0, Lcjm;->a:Lcjl;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, p1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {v0, v1}, Lcjl;->a(Lbwm;)V

    return-void
.end method

.class public abstract Lbua;
.super Lbwp;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V
    .locals 1

    sget-object v0, Lbut;->a:Lbwe;

    invoke-direct {p0, v0, p1}, Lbwp;-><init>(Lbwe;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x7d1

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lbua;->a(Lcom/google/android/gms/common/api/Status;)Lbwm;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbua;->a(Lbwm;)V

    return-void
.end method

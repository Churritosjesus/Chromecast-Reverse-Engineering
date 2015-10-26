.class final Lckd;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private synthetic b:Lckh;


# direct methods
.method constructor <init>(Lckc;Lcom/google/android/gms/common/api/GoogleApiClient;Lckh;)V
    .locals 0

    iput-object p2, p0, Lckd;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iput-object p3, p0, Lckd;->b:Lckh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lckd;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    iget-object v1, p0, Lckd;->b:Lckh;

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwp;)Lbwp;

    return-void
.end method

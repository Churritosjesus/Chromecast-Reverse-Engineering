.class final Lbxo;
.super Ljava/lang/Object;

# interfaces
.implements Lbwh;


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/gms/common/api/GoogleApiClient;

.field public final c:Lbwh;

.field private synthetic d:Lbxn;


# direct methods
.method public constructor <init>(Lbxn;ILcom/google/android/gms/common/api/GoogleApiClient;Lbwh;)V
    .locals 0

    iput-object p1, p0, Lbxo;->d:Lbxn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lbxo;->a:I

    iput-object p3, p0, Lbxo;->b:Lcom/google/android/gms/common/api/GoogleApiClient;

    iput-object p4, p0, Lbxo;->c:Lbwh;

    invoke-interface {p3, p0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwh;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 4

    iget-object v0, p0, Lbxo;->d:Lbxn;

    invoke-static {v0}, Lbxn;->d(Lbxn;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lbxp;

    iget-object v2, p0, Lbxo;->d:Lbxn;

    iget v3, p0, Lbxo;->a:I

    invoke-direct {v1, v2, v3, p1}, Lbxp;-><init>(Lbxn;ILcom/google/android/gms/common/ConnectionResult;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

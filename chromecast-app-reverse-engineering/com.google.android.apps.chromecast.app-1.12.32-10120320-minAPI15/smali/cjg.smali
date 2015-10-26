.class public final Lcjg;
.super Lcjl;


# instance fields
.field private synthetic g:Ljava/lang/String;

.field private synthetic h:Landroid/app/PendingIntent;


# direct methods
.method public constructor <init>(Lbvf;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p3, p0, Lcjg;->g:Ljava/lang/String;

    iput-object p4, p0, Lcjg;->h:Landroid/app/PendingIntent;

    invoke-direct {p0, p1, p2}, Lcjl;-><init>(Lbvf;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 5

    .prologue
    .line 0
    check-cast p1, Lcjr;

    .line 1000
    new-instance v1, Lcjm;

    invoke-direct {v1, p0}, Lcjm;-><init>(Lcjl;)V

    iget-object v2, p0, Lcjg;->g:Ljava/lang/String;

    iget-object v3, p0, Lcjg;->h:Landroid/app/PendingIntent;

    .line 2000
    invoke-virtual {p1}, Lcjr;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcjw;

    iget-object v4, p1, Lcjr;->b:Lcjz;

    invoke-interface {v0, v1, v4, v2, v3}, Lcjw;->a(Lcjt;Lcjz;Ljava/lang/String;Landroid/app/PendingIntent;)V

    .line 0
    return-void
.end method

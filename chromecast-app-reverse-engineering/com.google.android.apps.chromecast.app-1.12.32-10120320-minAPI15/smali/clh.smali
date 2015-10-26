.class public final Lclh;
.super Lcli;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcpt;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 0
    iput-object p3, p0, Lclh;->a:Ljava/lang/String;

    iput-object p4, p0, Lclh;->g:Ljava/lang/String;

    .line 1000
    invoke-direct {p0, p2}, Lcli;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    .line 0
    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 3

    .prologue
    .line 0
    check-cast p1, Lcsa;

    .line 2000
    iget-object v0, p0, Lclh;->a:Ljava/lang/String;

    iget-object v1, p0, Lclh;->g:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p1, p0, v0, v1, v2}, Lcsa;->a(Lbwq;Ljava/lang/String;Ljava/lang/String;I)Lbye;

    move-result-object v0

    invoke-virtual {p0, v0}, Lclh;->a(Lbye;)V

    .line 0
    return-void
.end method

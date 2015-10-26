.class public Lcpv;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 5000
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public sendFeedback(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)Lbwj;
    .locals 4

    .prologue
    .line 2000
    const-string v0, "PeopleClientCall"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    .line 1000
    if-eqz v0, :cond_0

    const-string v0, "sendFeedback"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, La;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    new-instance v0, Lclk;

    invoke-direct {v0, p0, p1, p2, p3}, Lclk;-><init>(Lcpv;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

.method public sendFeedback(Lcom/google/android/gms/common/api/GoogleApiClient;[Ljava/lang/String;I)Lbwj;
    .locals 4

    .prologue
    .line 4000
    const-string v0, "PeopleClientCall"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    .line 3000
    if-eqz v0, :cond_0

    const-string v0, "sendFeedback"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 v2, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, La;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    sget-object v0, Lcsi;->a:Ljava/lang/String;

    invoke-static {v0, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcll;

    invoke-direct {v1, p0, p1, v0, p3}, Lcll;-><init>(Lcpv;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/common/api/GoogleApiClient;->b(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

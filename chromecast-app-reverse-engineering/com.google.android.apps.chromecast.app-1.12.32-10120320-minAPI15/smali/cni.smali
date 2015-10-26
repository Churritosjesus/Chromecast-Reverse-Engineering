.class public final Lcni;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lbvz;

.field public static b:Lcnd;

.field private static final c:Lbwe;

.field private static final d:Lbwd;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbwe;

    invoke-direct {v0}, Lbwe;-><init>()V

    sput-object v0, Lcni;->c:Lbwe;

    new-instance v0, Lcnj;

    invoke-direct {v0}, Lcnj;-><init>()V

    sput-object v0, Lcni;->d:Lbwd;

    new-instance v0, Lbvz;

    const-string v1, "LocationServices.API"

    sget-object v2, Lcni;->d:Lbwd;

    sget-object v3, Lcni;->c:Lbwe;

    const/4 v4, 0x0

    new-array v4, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lbvz;-><init>(Ljava/lang/String;Lbwd;Lbwe;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcni;->a:Lbvz;

    new-instance v0, Lcnd;

    invoke-direct {v0}, Lcnd;-><init>()V

    sput-object v0, Lcni;->b:Lcnd;

    new-instance v0, Lcne;

    invoke-direct {v0}, Lcne;-><init>()V

    new-instance v0, Lcnl;

    invoke-direct {v0}, Lcnl;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/android/gms/common/api/GoogleApiClient;)Lcod;
    .locals 4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "GoogleApiClient parameter is required."

    invoke-static {v0, v3}, La;->b(ZLjava/lang/Object;)V

    sget-object v0, Lcni;->c:Lbwe;

    invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwe;)Lbwc;

    move-result-object v0

    check-cast v0, Lcod;

    if-eqz v0, :cond_1

    :goto_1
    const-string v2, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature."

    invoke-static {v1, v2}, La;->a(ZLjava/lang/Object;)V

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method

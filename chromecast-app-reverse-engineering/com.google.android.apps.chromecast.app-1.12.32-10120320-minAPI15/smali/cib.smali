.class public final Lcib;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lbvz;

.field private static final b:Lbwe;

.field private static final c:Lbwd;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbwe;

    invoke-direct {v0}, Lbwe;-><init>()V

    sput-object v0, Lcib;->b:Lbwe;

    new-instance v0, Lcic;

    invoke-direct {v0}, Lcic;-><init>()V

    sput-object v0, Lcib;->c:Lbwd;

    new-instance v0, Lbvz;

    const-string v1, "Feedback.API"

    sget-object v2, Lcib;->c:Lbwd;

    sget-object v3, Lcib;->b:Lbwe;

    const/4 v4, 0x0

    new-array v4, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lbvz;-><init>(Ljava/lang/String;Lbwd;Lbwe;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcib;->a:Lbvz;

    return-void
.end method

.method static synthetic a()Lbwe;
    .locals 1

    sget-object v0, Lcib;->b:Lbwe;

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/graphics/Bitmap;Landroid/os/Bundle;)Lbwj;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcid;

    invoke-direct {v0, p0, p1, p2}, Lcid;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Landroid/graphics/Bitmap;Landroid/os/Bundle;)V

    invoke-interface {p0, v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->a(Lbwp;)Lbwp;

    move-result-object v0

    return-object v0
.end method

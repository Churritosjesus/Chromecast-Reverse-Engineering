.class public final Lbvc;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lbwe;

.field public static final b:Lbvz;

.field public static final c:Lbvf;

.field private static d:Lbwd;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbwe;

    invoke-direct {v0}, Lbwe;-><init>()V

    sput-object v0, Lbvc;->a:Lbwe;

    new-instance v0, Lbvd;

    invoke-direct {v0}, Lbvd;-><init>()V

    sput-object v0, Lbvc;->d:Lbwd;

    new-instance v0, Lbvz;

    const-string v1, "CastMirroring.API"

    sget-object v2, Lbvc;->d:Lbwd;

    sget-object v3, Lbvc;->a:Lbwe;

    const/4 v4, 0x0

    new-array v4, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lbvz;-><init>(Ljava/lang/String;Lbwd;Lbwe;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lbvc;->b:Lbvz;

    new-instance v0, Lbvf;

    invoke-direct {v0}, Lbvf;-><init>()V

    sput-object v0, Lbvc;->c:Lbvf;

    return-void
.end method

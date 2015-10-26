.class public final Lclp;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lbwd;

.field private static b:Lbwe;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbwe;

    invoke-direct {v0}, Lbwe;-><init>()V

    sput-object v0, Lclp;->b:Lbwe;

    new-instance v0, Lclq;

    invoke-direct {v0}, Lclq;-><init>()V

    sput-object v0, Lclp;->a:Lbwd;

    new-instance v0, Lbvz;

    const-string v1, "SignIn.API"

    sget-object v2, Lclp;->a:Lbwd;

    sget-object v3, Lclp;->b:Lbwe;

    const/4 v4, 0x0

    new-array v4, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lbvz;-><init>(Ljava/lang/String;Lbwd;Lbwe;[Lcom/google/android/gms/common/api/Scope;)V

    new-instance v0, Lclr;

    invoke-direct {v0}, Lclr;-><init>()V

    return-void
.end method

.class public final Lbsr;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lbvz;

.field public static final b:Lbsu;

.field private static final c:Lbwd;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbss;

    invoke-direct {v0}, Lbss;-><init>()V

    sput-object v0, Lbsr;->c:Lbwd;

    new-instance v0, Lbvz;

    const-string v1, "Cast.API"

    sget-object v2, Lbsr;->c:Lbwd;

    sget-object v3, Lbut;->a:Lbwe;

    const/4 v4, 0x0

    new-array v4, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lbvz;-><init>(Ljava/lang/String;Lbwd;Lbwe;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lbsr;->a:Lbvz;

    new-instance v0, Lbsu;

    invoke-direct {v0}, Lbsu;-><init>()V

    sput-object v0, Lbsr;->b:Lbsu;

    return-void
.end method

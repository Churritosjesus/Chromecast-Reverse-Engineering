.class public final Lcpx;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lbwe;

.field public static final b:Lbvz;

.field public static final c:Lcpp;

.field public static final d:Lcpt;

.field private static e:Lbwd;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lbwe;

    invoke-direct {v0}, Lbwe;-><init>()V

    sput-object v0, Lcpx;->a:Lbwe;

    new-instance v0, Lcpy;

    invoke-direct {v0}, Lcpy;-><init>()V

    sput-object v0, Lcpx;->e:Lbwd;

    new-instance v0, Lbvz;

    const-string v1, "People.API_1P"

    sget-object v2, Lcpx;->e:Lbwd;

    sget-object v3, Lcpx;->a:Lbwe;

    const/4 v4, 0x0

    new-array v4, v4, [Lcom/google/android/gms/common/api/Scope;

    invoke-direct {v0, v1, v2, v3, v4}, Lbvz;-><init>(Ljava/lang/String;Lbwd;Lbwe;[Lcom/google/android/gms/common/api/Scope;)V

    sput-object v0, Lcpx;->b:Lbvz;

    new-instance v0, Lcrm;

    invoke-direct {v0}, Lcrm;-><init>()V

    new-instance v0, Lcpp;

    invoke-direct {v0}, Lcpp;-><init>()V

    sput-object v0, Lcpx;->c:Lcpp;

    new-instance v0, Lcps;

    invoke-direct {v0}, Lcps;-><init>()V

    new-instance v0, Lcpt;

    invoke-direct {v0}, Lcpt;-><init>()V

    sput-object v0, Lcpx;->d:Lcpt;

    new-instance v0, Lcqd;

    invoke-direct {v0}, Lcqd;-><init>()V

    new-instance v0, Lcpn;

    invoke-direct {v0}, Lcpn;-><init>()V

    new-instance v0, Lcpv;

    invoke-direct {v0}, Lcpv;-><init>()V

    new-instance v0, Lcst;

    invoke-direct {v0}, Lcst;-><init>()V

    new-instance v0, Lcpo;

    invoke-direct {v0}, Lcpo;-><init>()V

    new-instance v0, Lcpw;

    invoke-direct {v0}, Lcpw;-><init>()V

    return-void
.end method

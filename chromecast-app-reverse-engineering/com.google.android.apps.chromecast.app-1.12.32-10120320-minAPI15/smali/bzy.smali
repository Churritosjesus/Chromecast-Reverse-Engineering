.class public final Lbzy;
.super Ljava/lang/Object;


# static fields
.field public static a:Lcks;

.field public static b:Lcks;

.field public static c:Lcks;

.field public static d:Lcks;

.field public static e:Lcks;

.field public static f:Lcks;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "gms:common:stats:connections:level"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcks;->a(Ljava/lang/String;Ljava/lang/Integer;)Lcks;

    move-result-object v0

    sput-object v0, Lbzy;->a:Lcks;

    const-string v0, "gms:common:stats:connections:ignored_calling_processes"

    const-string v1, ""

    invoke-static {v0, v1}, Lcks;->a(Ljava/lang/String;Ljava/lang/String;)Lcks;

    move-result-object v0

    sput-object v0, Lbzy;->b:Lcks;

    const-string v0, "gms:common:stats:connections:ignored_calling_services"

    const-string v1, ""

    invoke-static {v0, v1}, Lcks;->a(Ljava/lang/String;Ljava/lang/String;)Lcks;

    move-result-object v0

    sput-object v0, Lbzy;->c:Lcks;

    const-string v0, "gms:common:stats:connections:ignored_target_processes"

    const-string v1, ""

    invoke-static {v0, v1}, Lcks;->a(Ljava/lang/String;Ljava/lang/String;)Lcks;

    move-result-object v0

    sput-object v0, Lbzy;->d:Lcks;

    const-string v0, "gms:common:stats:connections:ignored_target_services"

    const-string v1, "com.google.android.gms.auth.GetToken"

    invoke-static {v0, v1}, Lcks;->a(Ljava/lang/String;Ljava/lang/String;)Lcks;

    move-result-object v0

    sput-object v0, Lbzy;->e:Lcks;

    const-string v0, "gms:common:stats:connections:time_out_duration"

    const-wide/32 v2, 0x927c0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcks;->a(Ljava/lang/String;Ljava/lang/Long;)Lcks;

    move-result-object v0

    sput-object v0, Lbzy;->f:Lcks;

    return-void
.end method

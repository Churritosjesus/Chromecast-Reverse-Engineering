.class public final Lcyx;
.super Lcvf;


# static fields
.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcip;->f:Lcip;

    invoke-virtual {v0}, Lcip;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcyx;->b:Ljava/lang/String;

    sget-object v0, Lcit;->M:Lcit;

    invoke-virtual {v0}, Lcit;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcyx;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    sget-object v0, Lcyx;->b:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    sget-object v3, Lcyx;->c:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-direct {p0, v0, v1}, Lcvf;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcyx;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcyx;->c:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Lcje;
    .locals 1

    sget-object v0, Lcyx;->c:Ljava/lang/String;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    return-object v0
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.class final Lcya;
.super Lcvf;


# static fields
.field private static final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcip;->s:Lcip;

    invoke-virtual {v0}, Lcip;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcya;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget-object v0, Lcya;->b:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcvf;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Map;)Lcje;
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lcyh;->a(Ljava/lang/Object;)Lcje;

    move-result-object v0

    return-object v0
.end method

.method public final a()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

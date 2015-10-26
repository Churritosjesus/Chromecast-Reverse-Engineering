.class public final enum Ldgg;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Ldgg;

.field public static final enum b:Ldgg;

.field public static final enum c:Ldgg;

.field private static enum e:Ldgg;

.field private static final synthetic f:[Ldgg;


# instance fields
.field final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 25
    new-instance v0, Ldgg;

    const-string v1, "TLS_1_2"

    const-string v2, "TLSv1.2"

    invoke-direct {v0, v1, v3, v2}, Ldgg;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldgg;->a:Ldgg;

    .line 26
    new-instance v0, Ldgg;

    const-string v1, "TLS_1_1"

    const-string v2, "TLSv1.1"

    invoke-direct {v0, v1, v4, v2}, Ldgg;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldgg;->b:Ldgg;

    .line 27
    new-instance v0, Ldgg;

    const-string v1, "TLS_1_0"

    const-string v2, "TLSv1"

    invoke-direct {v0, v1, v5, v2}, Ldgg;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldgg;->c:Ldgg;

    .line 28
    new-instance v0, Ldgg;

    const-string v1, "SSL_3_0"

    const-string v2, "SSLv3"

    invoke-direct {v0, v1, v6, v2}, Ldgg;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ldgg;->e:Ldgg;

    .line 24
    const/4 v0, 0x4

    new-array v0, v0, [Ldgg;

    sget-object v1, Ldgg;->a:Ldgg;

    aput-object v1, v0, v3

    sget-object v1, Ldgg;->b:Ldgg;

    aput-object v1, v0, v4

    sget-object v1, Ldgg;->c:Ldgg;

    aput-object v1, v0, v5

    sget-object v1, Ldgg;->e:Ldgg;

    aput-object v1, v0, v6

    sput-object v0, Ldgg;->f:[Ldgg;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 34
    iput-object p3, p0, Ldgg;->d:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public static a(Ljava/lang/String;)Ldgg;
    .locals 3

    .prologue
    .line 38
    const/4 v0, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    :cond_0
    :goto_0
    packed-switch v0, :pswitch_data_0

    .line 44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected TLS version: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :sswitch_0
    const-string v1, "TLSv1.2"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :sswitch_1
    const-string v1, "TLSv1.1"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "TLSv1"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :sswitch_3
    const-string v1, "SSLv3"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    .line 39
    :pswitch_0
    sget-object v0, Ldgg;->a:Ldgg;

    .line 42
    :goto_1
    return-object v0

    .line 40
    :pswitch_1
    sget-object v0, Ldgg;->b:Ldgg;

    goto :goto_1

    .line 41
    :pswitch_2
    sget-object v0, Ldgg;->c:Ldgg;

    goto :goto_1

    .line 42
    :pswitch_3
    sget-object v0, Ldgg;->e:Ldgg;

    goto :goto_1

    .line 38
    :sswitch_data_0
    .sparse-switch
        -0x1dfc3f27 -> :sswitch_1
        -0x1dfc3f26 -> :sswitch_0
        0x4b88569 -> :sswitch_3
        0x4c38896 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Ldgg;
    .locals 1

    .prologue
    .line 24
    const-class v0, Ldgg;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ldgg;

    return-object v0
.end method

.method public static values()[Ldgg;
    .locals 1

    .prologue
    .line 24
    sget-object v0, Ldgg;->f:[Ldgg;

    invoke-virtual {v0}, [Ldgg;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldgg;

    return-object v0
.end method

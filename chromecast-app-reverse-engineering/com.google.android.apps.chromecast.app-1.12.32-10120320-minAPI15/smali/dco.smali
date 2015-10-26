.class public final enum Ldco;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Ldco;

.field public static final enum b:Ldco;

.field public static final enum c:Ldco;

.field private static enum e:Ldco;

.field private static enum f:Ldco;

.field private static final synthetic g:[Ldco;


# instance fields
.field final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 19
    new-instance v0, Ldco;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v2, v2}, Ldco;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldco;->e:Ldco;

    .line 23
    new-instance v0, Ldco;

    const-string v1, "PRIMARY"

    invoke-direct {v0, v1, v3, v3}, Ldco;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldco;->a:Ldco;

    .line 27
    new-instance v0, Ldco;

    const-string v1, "SECONDARY"

    invoke-direct {v0, v1, v4, v4}, Ldco;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldco;->b:Ldco;

    .line 31
    new-instance v0, Ldco;

    const-string v1, "PERSONALIZED"

    invoke-direct {v0, v1, v5, v5}, Ldco;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldco;->f:Ldco;

    .line 35
    new-instance v0, Ldco;

    const-string v1, "PERSONALIZATION_FLOW"

    invoke-direct {v0, v1, v6, v6}, Ldco;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldco;->c:Ldco;

    .line 14
    const/4 v0, 0x5

    new-array v0, v0, [Ldco;

    sget-object v1, Ldco;->e:Ldco;

    aput-object v1, v0, v2

    sget-object v1, Ldco;->a:Ldco;

    aput-object v1, v0, v3

    sget-object v1, Ldco;->b:Ldco;

    aput-object v1, v0, v4

    sget-object v1, Ldco;->f:Ldco;

    aput-object v1, v0, v5

    sget-object v1, Ldco;->c:Ldco;

    aput-object v1, v0, v6

    sput-object v0, Ldco;->g:[Ldco;

    .line 80
    new-instance v0, Ldcp;

    invoke-direct {v0}, Ldcp;-><init>()V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 89
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 90
    iput p3, p0, Ldco;->d:I

    .line 91
    return-void
.end method

.method public static a(I)Ldco;
    .locals 1

    .prologue
    .line 65
    packed-switch p0, :pswitch_data_0

    .line 71
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 66
    :pswitch_0
    sget-object v0, Ldco;->e:Ldco;

    goto :goto_0

    .line 67
    :pswitch_1
    sget-object v0, Ldco;->a:Ldco;

    goto :goto_0

    .line 68
    :pswitch_2
    sget-object v0, Ldco;->b:Ldco;

    goto :goto_0

    .line 69
    :pswitch_3
    sget-object v0, Ldco;->f:Ldco;

    goto :goto_0

    .line 70
    :pswitch_4
    sget-object v0, Ldco;->c:Ldco;

    goto :goto_0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Ldco;
    .locals 1

    .prologue
    .line 14
    const-class v0, Ldco;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ldco;

    return-object v0
.end method

.method public static values()[Ldco;
    .locals 1

    .prologue
    .line 14
    sget-object v0, Ldco;->g:[Ldco;

    invoke-virtual {v0}, [Ldco;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldco;

    return-object v0
.end method

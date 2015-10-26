.class public final enum Lbat;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:Lbat;

.field public static final enum b:Lbat;

.field public static final enum c:Lbat;

.field public static final enum d:Lbat;

.field public static final enum e:Lbat;

.field private static final synthetic h:[Lbat;


# instance fields
.field f:I

.field g:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 9
    new-instance v0, Lbat;

    const-string v1, "DEVICES_DRAWER"

    sget v2, La;->es:I

    sget v3, Lb;->br:I

    invoke-direct {v0, v1, v4, v2, v3}, Lbat;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lbat;->a:Lbat;

    .line 10
    new-instance v0, Lbat;

    const-string v1, "MIRROR_DRAWER"

    sget v2, La;->eu:I

    sget v3, Lb;->bp:I

    invoke-direct {v0, v1, v5, v2, v3}, Lbat;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lbat;->b:Lbat;

    .line 11
    new-instance v0, Lbat;

    const-string v1, "LEARN_DRAWER"

    sget v2, La;->et:I

    sget v3, Lb;->bs:I

    invoke-direct {v0, v1, v6, v2, v3}, Lbat;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lbat;->c:Lbat;

    .line 12
    new-instance v0, Lbat;

    const-string v1, "HELP_DRAWER"

    sget v2, La;->er:I

    sget v3, Lb;->bK:I

    invoke-direct {v0, v1, v7, v2, v3}, Lbat;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lbat;->d:Lbat;

    .line 13
    new-instance v0, Lbat;

    const-string v1, "DEBUG_DRAWER"

    sget v2, Lb;->bq:I

    invoke-direct {v0, v1, v8, v4, v2}, Lbat;-><init>(Ljava/lang/String;III)V

    sput-object v0, Lbat;->e:Lbat;

    .line 8
    const/4 v0, 0x5

    new-array v0, v0, [Lbat;

    sget-object v1, Lbat;->a:Lbat;

    aput-object v1, v0, v4

    sget-object v1, Lbat;->b:Lbat;

    aput-object v1, v0, v5

    sget-object v1, Lbat;->c:Lbat;

    aput-object v1, v0, v6

    sget-object v1, Lbat;->d:Lbat;

    aput-object v1, v0, v7

    sget-object v1, Lbat;->e:Lbat;

    aput-object v1, v0, v8

    sput-object v0, Lbat;->h:[Lbat;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 19
    iput p3, p0, Lbat;->f:I

    .line 20
    iput p4, p0, Lbat;->g:I

    .line 21
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lbat;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lbat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lbat;

    return-object v0
.end method

.method public static values()[Lbat;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lbat;->h:[Lbat;

    invoke-virtual {v0}, [Lbat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbat;

    return-object v0
.end method

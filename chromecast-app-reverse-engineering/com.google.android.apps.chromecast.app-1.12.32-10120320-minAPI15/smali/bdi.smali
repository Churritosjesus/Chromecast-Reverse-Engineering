.class public final Lbdi;
.super Ljava/lang/Enum;
.source "PG"


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field public static final enum d:I

.field public static final enum e:I

.field public static final enum f:I

.field private static final synthetic g:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 143
    sput v3, Lbdi;->a:I

    .line 144
    sput v4, Lbdi;->b:I

    .line 145
    sput v5, Lbdi;->c:I

    .line 146
    sput v6, Lbdi;->d:I

    .line 147
    sput v7, Lbdi;->e:I

    .line 148
    const/4 v0, 0x6

    sput v0, Lbdi;->f:I

    .line 142
    const/4 v0, 0x6

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lbdi;->a:I

    aput v2, v0, v1

    sget v1, Lbdi;->b:I

    aput v1, v0, v3

    sget v1, Lbdi;->c:I

    aput v1, v0, v4

    sget v1, Lbdi;->d:I

    aput v1, v0, v5

    sget v1, Lbdi;->e:I

    aput v1, v0, v6

    sget v1, Lbdi;->f:I

    aput v1, v0, v7

    sput-object v0, Lbdi;->g:[I

    return-void
.end method

.method public static a()[I
    .locals 1

    .prologue
    .line 142
    sget-object v0, Lbdi;->g:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

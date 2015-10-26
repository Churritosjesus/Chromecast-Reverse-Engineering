.class public final Lddv;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final a:Ljava/nio/charset/Charset;

.field public static final b:[B

.field public static final c:Lddn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 28
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lddv;->a:Ljava/nio/charset/Charset;

    .line 29
    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 348
    new-array v0, v2, [B

    .line 353
    sput-object v0, Lddv;->b:[B

    .line 354
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 357
    sget-object v0, Lddv;->b:[B

    .line 1037
    array-length v1, v0

    invoke-static {v0, v2, v1}, Lddn;->a([BII)Lddn;

    move-result-object v0

    .line 358
    sput-object v0, Lddv;->c:Lddn;

    .line 357
    return-void
.end method

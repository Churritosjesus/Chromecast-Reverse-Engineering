.class public final Lddx;
.super Ljava/io/IOException;
.source "PG"


# static fields
.field private static final serialVersionUID:J = -0x166db9773d0dffacL


# instance fields
.field public a:Ldea;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lddx;->a:Ldea;

    .line 19
    return-void
.end method

.method static a()Lddx;
    .locals 2

    .prologue
    .line 42
    new-instance v0, Lddx;

    const-string v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Lddx;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static b()Lddx;
    .locals 2

    .prologue
    .line 50
    new-instance v0, Lddx;

    const-string v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Lddx;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static c()Lddx;
    .locals 2

    .prologue
    .line 56
    new-instance v0, Lddx;

    const-string v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Lddx;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static d()Lddx;
    .locals 2

    .prologue
    .line 61
    new-instance v0, Lddx;

    const-string v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lddx;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static e()Lddx;
    .locals 2

    .prologue
    .line 66
    new-instance v0, Lddx;

    const-string v1, "Protocol message end-group tag did not match expected tag."

    invoke-direct {v0, v1}, Lddx;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static f()Lddx;
    .locals 2

    .prologue
    .line 71
    new-instance v0, Lddx;

    const-string v1, "Protocol message tag had invalid wire type."

    invoke-direct {v0, v1}, Lddx;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static g()Lddx;
    .locals 2

    .prologue
    .line 76
    new-instance v0, Lddx;

    const-string v1, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {v0, v1}, Lddx;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

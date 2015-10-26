.class public final Ladf;
.super Laef;
.source "PG"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Laef;-><init>()V

    return-void
.end method

.method public constructor <init>(Ladp;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1}, Laef;-><init>(Ladp;)V

    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1}, Laef;-><init>(Ljava/lang/String;)V

    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Laef;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 45
    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 56
    invoke-super {p0}, Laef;->getMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

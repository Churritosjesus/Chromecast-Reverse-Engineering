.class public final Lbgl;
.super Laeq;
.source "PG"


# instance fields
.field private final a:Ldft;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    new-instance v0, Ldft;

    invoke-direct {v0}, Ldft;-><init>()V

    invoke-direct {p0, v0}, Lbgl;-><init>(Ldft;)V

    .line 24
    return-void
.end method

.method private constructor <init>(Ldft;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Laeq;-><init>()V

    .line 30
    iput-object p1, p0, Lbgl;->a:Ldft;

    .line 31
    return-void
.end method


# virtual methods
.method protected final a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .locals 2

    .prologue
    .line 35
    new-instance v0, Ldfv;

    iget-object v1, p0, Lbgl;->a:Ldft;

    invoke-direct {v0, v1}, Ldfv;-><init>(Ldft;)V

    invoke-virtual {v0, p1}, Ldfv;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v0

    return-object v0
.end method

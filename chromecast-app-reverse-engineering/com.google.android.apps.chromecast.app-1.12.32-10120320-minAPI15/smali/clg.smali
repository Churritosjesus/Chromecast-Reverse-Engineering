.class public final Lclg;
.super Lcli;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic g:Ljava/lang/String;

.field private synthetic h:I

.field private synthetic i:I


# direct methods
.method public constructor <init>(Lcpt;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .prologue
    .line 0
    iput-object p3, p0, Lclg;->a:Ljava/lang/String;

    iput-object p4, p0, Lclg;->g:Ljava/lang/String;

    iput p5, p0, Lclg;->h:I

    iput p6, p0, Lclg;->i:I

    .line 1000
    invoke-direct {p0, p2}, Lcli;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    .line 0
    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 6

    .prologue
    .line 0
    move-object v0, p1

    check-cast v0, Lcsa;

    .line 2000
    iget-object v2, p0, Lclg;->a:Ljava/lang/String;

    iget-object v3, p0, Lclg;->g:Ljava/lang/String;

    iget v4, p0, Lclg;->h:I

    iget v5, p0, Lclg;->i:I

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcsa;->a(Lbwq;Ljava/lang/String;Ljava/lang/String;II)Lbye;

    move-result-object v0

    invoke-virtual {p0, v0}, Lclg;->a(Lbye;)V

    .line 0
    return-void
.end method

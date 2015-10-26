.class abstract Labw;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:[Ljava/lang/String;

.field final b:Landroid/net/Uri;

.field final c:Landroid/net/Uri;


# direct methods
.method public constructor <init>([Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;)V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Labw;->a:[Ljava/lang/String;

    .line 89
    iput-object p2, p0, Labw;->b:Landroid/net/Uri;

    .line 90
    iput-object p3, p0, Labw;->c:Landroid/net/Uri;

    .line 91
    return-void
.end method


# virtual methods
.method public abstract a(Landroid/content/res/Resources;ILjava/lang/CharSequence;)Ljava/lang/CharSequence;
.end method

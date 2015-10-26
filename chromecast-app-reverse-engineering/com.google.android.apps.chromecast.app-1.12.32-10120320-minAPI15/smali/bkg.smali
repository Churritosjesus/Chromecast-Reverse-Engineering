.class public final Lbkg;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Ljava/security/cert/CertificateFactory;

.field private d:Ljava/security/cert/CertPathValidator;

.field private final e:Ljava/security/cert/X509Certificate;

.field private final f:Ljava/security/cert/X509Certificate;

.field private final g:Ljava/security/cert/X509Certificate;

.field private final h:Lblp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lbkg;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lbkg;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Lblp;

    sget-object v1, Lbkg;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lbkg;->h:Lblp;

    .line 49
    iput-object p1, p0, Lbkg;->b:Landroid/content/Context;

    .line 50
    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    iput-object v0, p0, Lbkg;->c:Ljava/security/cert/CertificateFactory;

    .line 52
    :try_start_0
    const-string v0, "PKIX"

    invoke-static {v0}, Ljava/security/cert/CertPathValidator;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertPathValidator;

    move-result-object v0

    iput-object v0, p0, Lbkg;->d:Ljava/security/cert/CertPathValidator;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :goto_0
    const-string v0, "certs/chromecast_ca.crt"

    invoke-direct {p0, v0}, Lbkg;->a(Ljava/lang/String;)Ljava/security/cert/X509Certificate;

    move-result-object v0

    iput-object v0, p0, Lbkg;->e:Ljava/security/cert/X509Certificate;

    .line 55
    const-string v0, "certs/cast_root_ca.crt"

    invoke-direct {p0, v0}, Lbkg;->a(Ljava/lang/String;)Ljava/security/cert/X509Certificate;

    move-result-object v0

    iput-object v0, p0, Lbkg;->f:Ljava/security/cert/X509Certificate;

    .line 56
    const-string v0, "certs/chromecast_gen1_ica.crt"

    invoke-direct {p0, v0}, Lbkg;->a(Ljava/lang/String;)Ljava/security/cert/X509Certificate;

    move-result-object v0

    iput-object v0, p0, Lbkg;->g:Ljava/security/cert/X509Certificate;

    .line 57
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)Ljava/security/cert/X509Certificate;
    .locals 6

    .prologue
    .line 63
    const/4 v1, 0x0

    .line 65
    :try_start_0
    iget-object v0, p0, Lbkg;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    .line 66
    iget-object v0, p0, Lbkg;->c:Ljava/security/cert/CertificateFactory;

    invoke-virtual {v0, v1}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    if-eqz v1, :cond_0

    .line 73
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    :cond_0
    :goto_0
    return-object v0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    :try_start_2
    iget-object v2, p0, Lbkg;->h:Lblp;

    const-string v3, "Unable to read certificate asset: %s"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    invoke-virtual {v2, v0, v3, v4}, Lblp;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_1

    .line 73
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 74
    :cond_1
    :goto_1
    throw v0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_1
.end method

.method private b(Ljava/lang/String;)Ljava/security/cert/X509Certificate;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 123
    .line 125
    :try_start_0
    new-instance v2, Ljava/io/ByteArrayInputStream;

    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    :try_start_1
    iget-object v0, p0, Lbkg;->c:Ljava/security/cert/CertificateFactory;

    invoke-virtual {v0, v2}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 135
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 139
    :goto_0
    return-object v0

    .line 133
    :catch_0
    move-exception v0

    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_0

    .line 135
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    :cond_0
    :goto_2
    move-object v0, v1

    .line 139
    goto :goto_0

    .line 129
    :catch_1
    move-exception v0

    move-object v2, v1

    .line 130
    :goto_3
    :try_start_4
    iget-object v3, p0, Lbkg;->h:Lblp;

    const-string v4, "Certificate exception"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v4, v5}, Lblp;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 133
    if-eqz v2, :cond_1

    .line 135
    :try_start_5
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    :cond_1
    :goto_4
    move-object v0, v1

    .line 136
    goto :goto_0

    .line 133
    :catchall_0
    move-exception v0

    move-object v2, v1

    :goto_5
    if-eqz v2, :cond_2

    .line 135
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 136
    :cond_2
    :goto_6
    throw v0

    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v0

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_4

    :catch_5
    move-exception v1

    goto :goto_6

    .line 133
    :catchall_1
    move-exception v0

    goto :goto_5

    .line 129
    :catch_6
    move-exception v0

    goto :goto_3

    .line 133
    :catch_7
    move-exception v0

    move-object v0, v2

    goto :goto_1
.end method


# virtual methods
.method public final a(Ljava/lang/String;[Ljava/lang/String;)Ljava/security/cert/X509Certificate;
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x0

    .line 88
    invoke-direct {p0, p1}, Lbkg;->b(Ljava/lang/String;)Ljava/security/cert/X509Certificate;

    move-result-object v0

    .line 91
    :try_start_0
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 92
    new-instance v4, Ljava/security/cert/TrustAnchor;

    iget-object v5, p0, Lbkg;->e:Ljava/security/cert/X509Certificate;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Ljava/security/cert/TrustAnchor;-><init>(Ljava/security/cert/X509Certificate;[B)V

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 93
    new-instance v4, Ljava/security/cert/TrustAnchor;

    iget-object v5, p0, Lbkg;->f:Ljava/security/cert/X509Certificate;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Ljava/security/cert/TrustAnchor;-><init>(Ljava/security/cert/X509Certificate;[B)V

    invoke-interface {v2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 95
    new-instance v4, Ljava/security/cert/PKIXParameters;

    invoke-direct {v4, v2}, Ljava/security/cert/PKIXParameters;-><init>(Ljava/util/Set;)V

    .line 96
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/security/cert/PKIXParameters;->setRevocationEnabled(Z)V

    .line 97
    const/4 v2, 0x0

    invoke-virtual {v4, v2}, Ljava/security/cert/PKIXParameters;->setPolicyQualifiersRejected(Z)V

    .line 100
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 101
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    if-eqz p2, :cond_0

    array-length v2, p2

    if-lez v2, :cond_0

    .line 104
    array-length v6, p2

    move v2, v3

    :goto_0
    if-ge v2, v6, :cond_1

    aget-object v7, p2, v2

    .line 105
    invoke-direct {p0, v7}, Lbkg;->b(Ljava/lang/String;)Ljava/security/cert/X509Certificate;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 109
    :cond_0
    iget-object v2, p0, Lbkg;->g:Ljava/security/cert/X509Certificate;

    invoke-interface {v5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    :cond_1
    iget-object v2, p0, Lbkg;->c:Ljava/security/cert/CertificateFactory;

    invoke-virtual {v2, v5}, Ljava/security/cert/CertificateFactory;->generateCertPath(Ljava/util/List;)Ljava/security/cert/CertPath;

    move-result-object v2

    .line 113
    iget-object v5, p0, Lbkg;->d:Ljava/security/cert/CertPathValidator;

    invoke-virtual {v5, v2, v4}, Ljava/security/cert/CertPathValidator;->validate(Ljava/security/cert/CertPath;Ljava/security/cert/CertPathParameters;)Ljava/security/cert/CertPathValidatorResult;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 118
    :goto_1
    return-object v0

    .line 116
    :catch_0
    move-exception v0

    .line 117
    iget-object v2, p0, Lbkg;->h:Lblp;

    const-string v4, "exception while validating"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v4, v3}, Lblp;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, v1

    .line 118
    goto :goto_1
.end method
